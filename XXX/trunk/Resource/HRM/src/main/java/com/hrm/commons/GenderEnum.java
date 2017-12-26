package com.hrm.commons;

/**
 * The gender Emum
 * @author Admin
 *
 */
public enum GenderEnum {
	/**
	 * The gender of system
	 */
	FEMALE	("FEMALE", 0),
	MALE	("MALE", 1),
	OTHER	("OTHER", 2);
	
	/** The name gender*/
    private final String name;
    
    /** The code gender*/
    private final int code;

    private GenderEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }
    public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}
	
	public static String getEnumByCode(int code){
        for(GenderEnum e : GenderEnum.values()){
            if(code == e.code) {
            	return e.name();
            }
        }
        return null;
    }
	
}
