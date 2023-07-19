package com.example.system.domain;

public class Entity <ID>{

    private ID id;

    public Entity(){}
    public Entity(ID id) {
        this.id = id;
    }

    public ID getId(){
        return id;
    }

    public void setID(ID new_id){
        this.id = new_id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }
}
