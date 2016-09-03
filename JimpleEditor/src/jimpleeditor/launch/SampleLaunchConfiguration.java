package jimpleeditor.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.*;
public class SampleLaunchConfiguration extends LaunchConfigurationDelegate {

	  @Override
	  public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
	      throws CoreException {
	    String attribute = configuration.getAttribute(SampleLaunchConfigurationAttributes.CONSOLE_TEXT, "Jimple Editor");
	    System.out.println(attribute);
	    
	    /*List commandList = new ArrayList();
		
		// Perl executable
		IValueVariable perl = VariablesPlugin.getDefault().getStringVariableManager().getValueVariable(DebugCorePlugin.VARIALBE_PERL_EXECUTABLE);
		if (perl == null) {
			abort("Perl executable location undefined. Check value of ${perlExecutable}.", null);
		}
		String path = perl.getValue();
		if (path == null) {
			abort("Perl executable location unspecified. Check value of ${perlExecutable}.", null);
		}
		File exe = new File(path);
		if (!exe.exists()) {
			abort(MessageFormat.format("Specified Perl executable {0} does not exist. Check value of ${perlExecutable}.", new String[]{path}), null);
		}
		commandList.add(path);
		
		// Add PDA VM
		File vm = DebugCorePlugin.getFileInPlugin(new Path("pdavm/pda.pl"));
		if (vm == null) {
			abort("Missing PDA VM", null);
		}
		commandList.add(vm.getAbsolutePath());
		
		// program name
		String program = configuration.getAttribute(DebugCorePlugin.ATTR_PDA_PROGRAM, (String)null);
		if (program == null) {
			abort("Perl program unspecified.", null);
		}
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(program));
		if (!file.exists()) {
			abort(MessageFormat.format("Perl program {0} does not exist.", new String[] {file.getFullPath().toString()}), null);
		}
		
		commandList.add(file.getLocation().toOSString());
		
		// if in debug mode, add debug arguments - i.e. '-debug requestPort eventPort'
		int requestPort = -1;
		int eventPort = -1;
		if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			requestPort = findFreePort();
			eventPort = findFreePort();
			if (requestPort == -1 || eventPort == -1) {
				abort("Unable to find free port", null);
			}
			commandList.add("-debug");
			commandList.add("" + requestPort);
			commandList.add("" + eventPort);
		}
		
		String[] commandLine = (String[]) commandList.toArray(new String[commandList.size()]);
		Process process = DebugPlugin.exec(commandLine, null);
		IProcess p = DebugPlugin.newProcess(launch, process, path);
		// if in debug mode, create a debug target 
		if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			IDebugTarget target = new PDADebugTarget(launch, p, requestPort, eventPort);
			launch.addDebugTarget(target);
		}*/
	    
	  }

	}