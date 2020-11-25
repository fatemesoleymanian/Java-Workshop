package usc.ac.ir;

public class DocumentRequirments {

    private int ID;
    private  String ownerName, docType,docNum,docDate,descriptions;

    public int getID() {
        return ID;
    }

    public DocumentRequirments setID(int ID) {
        this.ID = ID;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public DocumentRequirments setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getDocType() {
        return docType;
    }

    public DocumentRequirments setDocType(String docType) {
        this.docType = docType;
        return this;
    }

    public String getDocNum() {
        return docNum;
    }

    public DocumentRequirments setDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    public String getDocDate() {
        return docDate;
    }

    public DocumentRequirments setDocDate(String docDate) {
        this.docDate = docDate;
        return this;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public DocumentRequirments setDescriptions(String descriptions) {
        this.descriptions = descriptions;
        return this;
    }}
