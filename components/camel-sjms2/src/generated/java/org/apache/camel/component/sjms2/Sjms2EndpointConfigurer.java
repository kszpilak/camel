/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms2;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sjms2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sjms2Endpoint target = (Sjms2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": target.setAcknowledgementMode(property(camelContext, org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercount":
        case "consumerCount": target.setConsumerCount(property(camelContext, int.class, value)); return true;
        case "durable": target.setDurable(property(camelContext, boolean.class, value)); return true;
        case "durablesubscriptionid":
        case "durableSubscriptionId": target.setDurableSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        case "shared": target.setShared(property(camelContext, boolean.class, value)); return true;
        case "subscriptionid":
        case "subscriptionId": target.setSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "messageselector":
        case "messageSelector": target.setMessageSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namedreplyto":
        case "namedReplyTo": target.setNamedReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": target.setPersistent(property(camelContext, boolean.class, value)); return true;
        case "producercount":
        case "producerCount": target.setProducerCount(property(camelContext, int.class, value)); return true;
        case "ttl": target.setTtl(property(camelContext, long.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "prefillpool":
        case "prefillPool": target.setPrefillPool(property(camelContext, boolean.class, value)); return true;
        case "responsetimeout":
        case "responseTimeOut": target.setResponseTimeOut(property(camelContext, long.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": target.setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener":
        case "asyncStopListener": target.setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectioncount":
        case "connectionCount": target.setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionresource":
        case "connectionResource": target.setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": target.setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "exceptionlistener":
        case "exceptionListener": target.setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": target.setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": target.setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "errorhandlerlogginglevel":
        case "errorHandlerLoggingLevel": target.setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorhandlerlogstacktrace":
        case "errorHandlerLogStackTrace": target.setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transactionbatchcount":
        case "transactionBatchCount": target.setTransactionBatchCount(property(camelContext, int.class, value)); return true;
        case "transactionbatchtimeout":
        case "transactionBatchTimeout": target.setTransactionBatchTimeout(property(camelContext, long.class, value)); return true;
        case "transactioncommitstrategy":
        case "transactionCommitStrategy": target.setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
        case "sharedjmssession":
        case "sharedJMSSession": target.setSharedJMSSession(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

