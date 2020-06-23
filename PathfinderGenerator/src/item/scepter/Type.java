package item.scepter;

public enum Type {
	MINOR("Mineur"),NORMAL("Normal"),SUPERIOR("Sup�rieur"),NONE("_");
	
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
