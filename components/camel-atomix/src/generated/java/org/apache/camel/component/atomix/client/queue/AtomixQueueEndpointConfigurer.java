/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.queue;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtomixQueueEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixQueueEndpoint target = (AtomixQueueEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": target.getConfiguration().setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": target.getConfiguration().setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.queue.AtomixQueue.Action.class, value)); return true;
        case "nodes": target.getConfiguration().setNodes(property(camelContext, java.lang.String.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "transportclassname":
        case "transportClassName": target.getConfiguration().setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": target.getConfiguration().setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": target.getConfiguration().setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": target.getConfiguration().setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "readconsistency":
        case "readConsistency": target.getConfiguration().setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": target.getConfiguration().setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": target.getConfiguration().setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

