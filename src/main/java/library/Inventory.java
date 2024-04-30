package library;

import java.util.ArrayList;

public class Inventory {
    public static ArrayList<Material> materials = new ArrayList<>();

    /**
     * I have to figure out what this method will be used for
     * @param checkingOut
     */
    public void checkoutMaterial(String checkingOut){

    }

    /**
     * need to figure out how this is used
     * @param materialType
     * @return
     */
    public ArrayList<Material> getMaterialsByType(int materialType){
        return materials;
    }

    /**
     * figure out how this will be used
     * @param material
     */
    public void returnMaterial(String material){

    }

    /**
     * this will return all the inventory
     * @return
     */
    public String displayAllInventory(){
        return "";
    }

    /**
     * this method adds new materials to the materials ArrayList
     * @param material
     */
    public void addMaterial(Material material){
        materials.add(material);
    }

    /**
     * this method is a boolean that is used to verify that material is
     * inside the ArrayList
     * @param material
     * @return
     */
    public boolean isMaterialCheckedOut(String material){
        return materials.contains(material);
    }
    public Material getMaterialById(String materialId){

    }


    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }
}
