class Badge {
    public String print(Integer id, String name, String department) {
        final String chefe = "OWNER";
        if(department == null){
            return id != null ? "["+id+"] - "+name+" - "+chefe: name+" - "+chefe;
        }else{
            return id != null ? "["+id+"] - "+name+" - "+department.toUpperCase(): name+" - "+department.toUpperCase();
        } 
    }
}
