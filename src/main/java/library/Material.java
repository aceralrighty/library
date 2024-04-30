package library;

public abstract class Material {
    private String callNumber;
    private boolean onHold;
    private Collection collection;
    private boolean checkedOut;

    public boolean isOnHold(){
        return true;
    }

    public Material(String callNumber, boolean onHold, Collection collection, boolean checkedOut) {
        this.callNumber = callNumber;
        this.onHold = onHold;
        this.collection = collection;
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "";
    }


    /**
     * all of these getters and setters are to grab user inputs later on
     *
     * @return
     */
    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }


    public void setOnHold(boolean onHold) {
        this.onHold = onHold;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
