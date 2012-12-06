package org.iiitb.finalassignment.mt2011147.commandpackage;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.iiitb.finalassignment.mt2011147.wizard.MakePlanWizard;

public class MakePlanCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		MakePlanWizard planWizard = new MakePlanWizard();
		WizardDialog wd = new WizardDialog(HandlerUtil.getActiveShell(event), planWizard);
		wd.open();
		
		
		return null;
	}

}
