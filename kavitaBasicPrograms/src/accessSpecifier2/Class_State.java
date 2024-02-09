package accessSpecifier2;

import accessSpecifier1.Class_City;

public class Class_State extends Class_City
{

	public static void main(String[] args) {
     Class_State c_state=new Class_State();
     c_state.mul();      // protected non static method can accessible
     c_state.sub();     // public non static method can accessible
    // c_state.div();    // it is default/package non static method but can't accessible
     
	}

}
