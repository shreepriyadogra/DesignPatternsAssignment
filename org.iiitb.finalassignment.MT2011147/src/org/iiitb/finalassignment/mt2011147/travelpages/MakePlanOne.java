package org.iiitb.finalassignment.mt2011147.travelpages;



import org.eclipse.jface.wizard.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;

public class MakePlanOne extends WizardPage{

	
	private Label ltourname;
	private Text ttourname;
	private Composite makecontainer;
	
	
	public MakePlanOne(){
		
		super("PageOne");
		setTitle("Make Plan for your Travel");
		setDescription("Provide tour name here");		
		
	}
	
	
	
	@Override
	public void createControl(Composite parent) {
		
		makecontainer = new Composite(parent, SWT.NULL);
		
		GridLayout gl = new GridLayout();
		makecontainer.setLayout(gl);
		gl.numColumns = 2;
		
		
		ltourname = new Label(makecontainer, SWT.NONE);
		ltourname.setText("Tour Name");
		
		ttourname = new Text(makecontainer, SWT.BORDER|SWT.SINGLE);
		ttourname.setText("");
		
		ttourname.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				if(!ttourname.getText().isEmpty())
					setPageComplete(true);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		ttourname.setLayoutData(gd);
		
		setControl(makecontainer);
		setPageComplete(false);
		
	}
	
	
	
	public String tour(){
		
		return ttourname.getText();
		
	}
	
	
	
	

}
