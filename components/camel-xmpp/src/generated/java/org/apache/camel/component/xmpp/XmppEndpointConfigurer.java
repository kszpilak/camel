/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmpp;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XmppEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmppEndpoint target = (XmppEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "login": target.setLogin(property(camelContext, boolean.class, value)); return true;
        case "nickname": target.setNickname(property(camelContext, java.lang.String.class, value)); return true;
        case "pubsub": target.setPubsub(property(camelContext, boolean.class, value)); return true;
        case "room": target.setRoom(property(camelContext, java.lang.String.class, value)); return true;
        case "servicename":
        case "serviceName": target.setServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "createaccount":
        case "createAccount": target.setCreateAccount(property(camelContext, boolean.class, value)); return true;
        case "resource": target.setResource(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connectionpolldelay":
        case "connectionPollDelay": target.setConnectionPollDelay(property(camelContext, int.class, value)); return true;
        case "doc": target.setDoc(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionconfig":
        case "connectionConfig": target.setConnectionConfig(property(camelContext, org.jivesoftware.smack.ConnectionConfiguration.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "roompassword":
        case "roomPassword": target.setRoomPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "user": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

