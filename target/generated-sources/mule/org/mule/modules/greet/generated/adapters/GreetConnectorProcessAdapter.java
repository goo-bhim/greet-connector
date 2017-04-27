
package org.mule.modules.greet.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.greet.GreetConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>GreetConnectorProcessAdapter</code> is a wrapper around {@link GreetConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-04-26T10:11:41-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class GreetConnectorProcessAdapter
    extends GreetConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<GreetConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, GreetConnectorCapabilitiesAdapter> getProcessTemplate() {
        final GreetConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,GreetConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, GreetConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, GreetConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
