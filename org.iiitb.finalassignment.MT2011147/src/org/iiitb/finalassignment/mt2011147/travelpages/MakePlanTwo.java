package org.iiitb.finalassignment.mt2011147.travelpages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MakePlanTwo extends WizardPage implements KeyListener {


	private Label lfrom,lto,lvia;
	private Text tfrom,tto,tvia;
	private Composite makecontainer;
	
	public MakePlanTwo(){
		
		super("Pagetwo");
		setTitle("Set your source and destination");
		setDescription("Mention source and destination");
	}

	@Override
	public void createControl(Composite parent) {
		makecontainer = new Composite(parent, SWT.NULL);
		
		GridLayout gl = new GridLayout();
		makecontainer.setLayout(gl);
		gl.numColumns = 2;
		
		lfrom = new Label(makecontainer, SWT.NONE);
		lfrom.setText("From");
		tfrom = new Text(makecontainer, SWT.BORDER|SWT.SINGLE);
		tfrom.setText("");
		tfrom.addKeyListener(this);
		lto = new Label(makecontainer, SWT.NONE);
		lto.setText("To");
		tto = new Text(makecontainer, SWT.BORDER|SWT.SINGLE);
		tto.setText("");
		tto.addKeyListener(this);
		lvia = new Label(makecontainer, SWT.NONE);
		lvia.setText("Via");
		tvia = new Text(makecontainer,SWT.BORDER|SWT.SINGLE);
		tvia.setText("");
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		tfrom.setLayoutData(gd);
		tto.setLayoutData(gd);
		tvia.setLayoutData(gd);
		
		setControl(makecontainer);
		setPageComplete(false);		
		
		
		
	}

	public String getTfrom() {
		return tfrom.getText();
	}

	public String getTto() {
		return tto.getText();
	}

	public String getTvia() {
		return tvia.getText();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(tfrom.getText().isEmpty()==false && tto.getText().isEmpty()==false)
			setPageComplete(true);
		else
			setPageComplete(false);
		
	}
	
	
	
}
