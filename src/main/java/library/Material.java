package library;

import library.multimedia.Multimedia;

/**
 * this is my super class
 */

public abstract class Material {
    private String callNumber;
    private boolean onHold;
    public Collection collection;
    private boolean checkedOut;

    public boolean isOnHold(){
        return onHold;
    }

    // parameterized constructor
    public Material(String callNumber, boolean onHold, Collection collection, boolean checkedOut) {
        setCallNumber(callNumber);
        setOnHold(onHold);
        setCollection(collection);
        setCheckedOut(checkedOut);
    }
// my very nice toString
    @Override
    public String toString() {
        return STR."""

Call number: \{getCallNumber()}
Collection: \{getCollection()}
Checked out: \{isCheckedOut()}
On hold: \{isOnHold()}""";
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
