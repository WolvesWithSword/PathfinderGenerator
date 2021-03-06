package com.wolveswithsword.pathfindergeneratorapp.View.RecyclerView_adapter_holder.item;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.wolveswithsword.pathfindergeneratorapp.R;
import com.wolveswithsword.pathfindergeneratorapp.View.Utils.AppObject;

import item.wand.Wand;

public class WandViewHolder extends ItemViewHolder {
    TextView name;
    TextView price;
    TextView propPart;
    TextView nds;
    TextView nls;

    LinearLayout propPartLayout;


    public WandViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.wand_name);
        price = itemView.findViewById(R.id.wand_price);
        propPart = itemView.findViewById(R.id.wand_part);
        propPartLayout = itemView.findViewById(R.id.wand_part_layout);

        image = itemView.findViewById(R.id.wand_image);
        delete = itemView.findViewById(R.id.wand_delete);

        nds = itemView.findViewById(R.id.wand_nds);
        nls = itemView.findViewById(R.id.wand_nls);

    }

    public void setWand(Wand wand){
        name.setText(wand.getName());
        price.setText(wand.getPrice()+" "+ AppObject.getRessource().getString(R.string.gp));

        if(wand.isParticularPropertie()){
            propPartLayout.setVisibility(View.VISIBLE);
            propPart.setText(R.string.hint);
        }
        else{
            propPartLayout.setVisibility(View.GONE);
        }

        image.setImageResource(R.drawable.item_wand_image);
        nds.setText(Integer.toString(wand.getNds()));
        nls.setText(Integer.toString(wand.getNls()));
    }
}
