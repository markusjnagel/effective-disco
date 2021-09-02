package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class Countries_getCountry_9_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kela.Countries service;

    public Countries_getCountry_9_Handler() {
        this(new org.kela.Countries());
    }

    @javax.inject.Inject()
    public Countries_getCountry_9_Handler(org.kela.Countries service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.getCountry((String) workItem.getParameter("name"));
        workItemManager.completeWorkItem(workItem.getStringId(), null);
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kela.Countries_getCountry_9_Handler";
    }
}
