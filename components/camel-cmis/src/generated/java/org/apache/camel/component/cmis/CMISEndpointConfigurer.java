/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cmis;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CMISEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CMISEndpoint target = (CMISEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "pagesize":
        case "pageSize": target.getSessionFacade().setPageSize(property(camelContext, int.class, value)); return true;
        case "readcontent":
        case "readContent": target.getSessionFacade().setReadContent(property(camelContext, boolean.class, value)); return true;
        case "readcount":
        case "readCount": target.getSessionFacade().setReadCount(property(camelContext, int.class, value)); return true;
        case "repositoryid":
        case "repositoryId": target.getSessionFacade().setRepositoryId(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "query": target.getSessionFacade().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "querymode":
        case "queryMode": target.setQueryMode(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "sessionfacadefactory":
        case "sessionFacadeFactory": target.setSessionFacadeFactory(property(camelContext, org.apache.camel.component.cmis.CMISSessionFacadeFactory.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "password": target.getSessionFacade().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.getSessionFacade().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

