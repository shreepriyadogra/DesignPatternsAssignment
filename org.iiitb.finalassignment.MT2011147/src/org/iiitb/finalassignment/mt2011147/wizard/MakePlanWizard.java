package org.iiitb.finalassignment.mt2011147.wizard;

import java.sql.SQLException;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.iiitb.finalassignment.mt2011147.travelpages.MakePlanOne;
import org.iiitb.finalassignment.mt2011147.travelpages.MakePlanThree;
import org.iiitb.finalassignment.mt2011147.travelpages.MakePlanTwo;
import org.iiitb.finalassignment.mt2011147.database.*;


public class MakePlanWizard extends Wizard implements INewWizard{

	
	protected MakePlanOne makeplanone;
	protected MakePlanTwo makeplantwo;
	protected MakePlanThree makeplanthree;
	
	public MakePlanWizard(){
		
		super();
		setNeedsProgressMonitor(true);
		
	}
	
	
	
	public void addPages(){
		
		makeplanone = new MakePlanOne();
		makeplantwo = new MakePlanTwo();
		makeplanthree = new MakePlanThree();
		
		addPage(makeplanone);
		addPage(makeplantwo);
		addPage(makeplanthree);
		
		
	}
	
		
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean performFinish() {
		
		System.out.println(makeplanone.tour());
		System.out.println(makeplantwo.getTfrom());
		System.out.println(makeplantwo.getTto());
		System.out.println(makeplantwo.getTvia());
		System.out.println(makeplanthree.cTouragent());
		System.out.println(makeplanthree.getDate());
		
		String sqlQuery=null;
		sqlQuery = "insert into planmytravel (plan_tour,plan_from,plan_to,plan_via,plan_touragent,plan_date) values ('"+ makeplanone.tour() +"','"+ makeplantwo.getTfrom() +"','"+ makeplantwo.getTto() +"','"+ makeplantwo.getTvia() +"','"+ makeplanthree.cTouragent() +"','"+ makeplanthree.getDate() +"')";
		
		Connect c=new Connect();
		try {
			c.dml(sqlQuery);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
	}

}
