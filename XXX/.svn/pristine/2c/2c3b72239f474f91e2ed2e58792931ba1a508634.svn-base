package com.hrm.commons;

/**
 * The married status enum
 * @author Admin
 *
 */
public enum MarriedStatusEnum {
	/**
	 * The Married Status of system
	 */
	SINGLE		("SINGLE", (short)0), 
    MARRIED 	("MARRIED", (short)1),
    DIVORCED 	("DIVORCED", (short)2), 
    WIDOWED 	("WIDOWED", (short)3),  
    COMPLICATED ("COMPLICATED", (short)4);
	
	/** The name married*/
    private final String name;
    
    /** The code married*/
    private final short code;

    private MarriedStatusEnum(String name, short code) {
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
        for(MarriedStatusEnum e : MarriedStatusEnum.values()){
            if(code == e.code) {
            	return e.name();
            }
        }
        return null;
    }
}
