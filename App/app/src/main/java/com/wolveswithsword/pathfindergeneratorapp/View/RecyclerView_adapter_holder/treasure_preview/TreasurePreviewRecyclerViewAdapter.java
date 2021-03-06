package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.treasure_preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Save.EditSaveActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Activity.Save.SaveMenuActivity;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.SaveNameDialog;
import com.wolveswithsword.pathfindergeneratorapp.View.Dialog.YesNoDialog;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;


import java.util.ArrayList;

import generator.TreasurePreview;
import item.Item;
import save.HandlerTreasureSave;

public class TreasurePreviewRecyclerViewAdapter
        extends RecyclerView.Adapter<TreasurePreviewViewHolder> {

    ArrayList<TreasurePreview> treasurePreviews;
    Context context;

    public TreasurePreviewRecyclerViewAdapter(ArrayList<TreasurePreview> treasurePreviews,Context context){
        this.treasurePreviews = treasurePreviews;
        this.context = context;
    }

    @NonNull
    @Override
    public TreasurePreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_preview, parent, false);
        return new TreasurePreviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TreasurePreviewViewHolder holder, int position) {
        holder.initView(treasurePreviews.get(position));
        holder.setButtonsListeners(this);//Listener du bouton de suppression
    }

    @Override
    public int getItemCount() {
        return treasurePreviews.size();
    }

    /**
     * Suppresion d'une sauvegarde
     * @param position de la sauvegarde
     */
    public void askDeleteSave(final int position){
        if(position<0) return; //correctif bug appuis multiple supression item

        YesNoDialog dialog = new YesNoDialog(position, context.getString(R.string.delete),
                context.getString(R.string.delete_save));
        dialog.show(((AppCompatActivity)context).getSupportFragmentManager()," yes no dialog ");//Affichage de la fenetre.
    }


    /**
     * Intent vers l'editeur de sauvegarde.
     */
    public void editSave(int position){

        ArrayList<Item> items = HandlerTreasureSave.getInstance().getTreasureSave(treasurePreviews.get(position).getName());
        TreasurePreview treasurePreview = treasurePreviews.get(position);

        Intent intent = new Intent(context, EditSaveActivity.class);
        intent.putExtra("itemList",items);
        intent.putExtra("treasurePreview",treasurePreview);
        context.startActivity(intent);
    }

    /**
     * Renomme la sauvegarde.
     * @param position
     */
    public void renameSave(int position){
        TreasurePreview treasurePreview = treasurePreviews.get(position);
        //Liste des objets
        ArrayList<Item> items = HandlerTreasureSave.getInstance().getTreasureSave(treasurePreview.getName());

        ((SaveMenuActivity) context).getRenamedFile(items,treasurePreview);

        SaveNameDialog saveNameDialog = new SaveNameDialog();
        saveNameDialog.show(((AppCompatActivity)context).getSupportFragmentManager()," save name dialog ");
    }

    public void deleteSave(boolean doAction, int position) {
        if(doAction && HandlerTreasureSave.getInstance().deleteSaveFile(treasurePreviews.get(position))){//Suppression du fichier
            treasurePreviews.remove(position);//Supression de la vue
            notifyItemRemoved(position);
            notifyItemRangeChanged(position,treasurePreviews.size());
        }
    }
}
