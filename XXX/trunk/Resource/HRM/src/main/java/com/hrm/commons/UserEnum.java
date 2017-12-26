package com.hrm.commons;

/**
 * @author Admin
 */
public enum UserEnum {

	/**
	 * The roles of system
	 */
	ADMIN			("ADMIN", 1),
    HR				("HR", 2),
    EMPLOYEE		("EMPLOYEE", 3),
    LEADER			("LEADER", 4),
    MANAGER			("MANAGER", 5),
    TRAINER			("TRAINER", 6);

	/** The name role*/
    private final String name;
    
    /** The code role*/
    private final int code;

    private UserEnum(String name, int code) {
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
        for(UserEnum e : UserEnum.values()){
            if(code == e.code) {
            	return e.name();
            }
        }
        return null;
    }
}
