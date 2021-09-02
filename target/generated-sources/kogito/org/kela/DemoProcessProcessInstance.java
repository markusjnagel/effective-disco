package org.kela;

public class DemoProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<DemoProcessModel> {

    public DemoProcessProcessInstance(org.kela.DemoProcessProcess process, DemoProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public DemoProcessProcessInstance(org.kela.DemoProcessProcess process, DemoProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public DemoProcessProcessInstance(org.kela.DemoProcessProcess process, DemoProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public DemoProcessProcessInstance(org.kela.DemoProcessProcess process, DemoProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(DemoProcessModel variables) {
        return variables.toMap();
    }

    protected void unbind(DemoProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
