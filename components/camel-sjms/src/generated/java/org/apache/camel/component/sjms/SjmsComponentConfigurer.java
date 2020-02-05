/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SjmsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SjmsComponent target = (SjmsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionresource":
        case "connectionResource": target.setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "connectioncount":
        case "connectionCount": target.setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": target.setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": target.setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "timedtaskmanager":
        case "timedTaskManager": target.setTimedTaskManager(property(camelContext, org.apache.camel.component.sjms.taskmanager.TimedTaskManager.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "connectiontestonborrow":
        case "connectionTestOnBorrow": target.setConnectionTestOnBorrow(property(camelContext, boolean.class, value)); return true;
        case "connectionusername":
        case "connectionUsername": target.setConnectionUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionpassword":
        case "connectionPassword": target.setConnectionPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionclientid":
        case "connectionClientId": target.setConnectionClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "connectionmaxwait":
        case "connectionMaxWait": target.setConnectionMaxWait(property(camelContext, long.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

