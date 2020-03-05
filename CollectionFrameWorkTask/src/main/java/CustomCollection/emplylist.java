package CustomCollection;

import java.util.ArrayList;

import model.Emply;

public class emplylist {
	ArrayList<Emply> emp;
	
	
	public emplylist(int n){
		emp = new ArrayList<Emply>(n);
	}

	public void indexOf(Emply e){
		emp.indexOf(e);
	}

	public boolean add(Emply e)
	{
		 return emp.add(e);
	}
	

	public void add(int i, Emply e) {
		emp.add(i, e);
	}

	public Emply remove(int i){
		return emp.remove(i);
		//return null;
	}

	public void remove(Emply e){
		emp.remove(e);
	}

	public void dispaly() {
		for(int i=0;i<emp.size();i++) {
			Emply e=emp.get(i);
			System.out.println("\nEMPLOYEE-"+(i+1)+"\n"+"NAME:- "+e.getName()+"\nAGE:- "+e.getAge()+"\nSALARY:- "+e.getSalary()+"\nADDRES:- "+e.getAddress());
		}
		
	}
	
	public void size() {
		
		System.out.println("\nthe Employee list SIZE is:- "+emp.size()+"\n");
		
	}

	
}
