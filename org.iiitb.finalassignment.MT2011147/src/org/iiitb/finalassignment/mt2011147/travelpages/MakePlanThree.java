package org.iiitb.finalassignment.mt2011147.travelpages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;

public class MakePlanThree extends WizardPage{

	private Label ltouragent,ldate;
	private Combo ctouragent;
	DateTime dt ;
	private Composite makecontainer;
	
	final static String[] touragents = {"Cleartrip","Yatra","Redbus","KSRTC"};
	
	public MakePlanThree(){
		
		super("PageThree");
		setTitle("Add Travel Agent");
		setDescription("Specify travel agent and date of journey");
		
	}
	
	
	
	
	@Override
	public void createControl(Composite parent) {
		
makecontainer = new Composite(parent, SWT.NULL);
		
		GridLayout gl = new GridLayout();
		makecontainer.setLayout(gl);
		gl.numColumns = 2;
		
		
		ltouragent = new Label(makecontainer, SWT.NONE);
		ltouragent.setText("Travel Agent");
		
		ctouragent = new Combo(makecontainer, SWT.BORDER|SWT.READ_ONLY);
		ctouragent.setItems(touragents);
		
		
		ldate = new Label(makecontainer, SWT.NONE);
		ldate.setText("Date of Journey");
		
		dt = new DateTime(makecontainer, SWT.CALENDAR);
		
		setControl(makecontainer);
		setPageComplete(true);
		
		
	}

	public String cTouragent(){
		
		return ctouragent.getText();
		
	}
	
	public String getDate(){
		
		String day,month, year;
		day = "" + dt.getDay();
		month = "" + dt.getMonth();
		year = "" + dt.getYear();
		
		return year+ "-"+ month + "-" + day ;
	}
	
}
