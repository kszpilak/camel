/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.blob;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BlobServiceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobServiceEndpoint target = (BlobServiceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": target.getConfiguration().setAzureBlobClient(property(camelContext, com.microsoft.azure.storage.blob.CloudBlob.class, value)); return true;
        case "bloboffset":
        case "blobOffset": target.getConfiguration().setBlobOffset(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobtype":
        case "blobType": target.getConfiguration().setBlobType(property(camelContext, org.apache.camel.component.azure.blob.BlobType.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": target.getConfiguration().setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "credentials": target.getConfiguration().setCredentials(property(camelContext, com.microsoft.azure.storage.StorageCredentials.class, value)); return true;
        case "datalength":
        case "dataLength": target.getConfiguration().setDataLength(property(camelContext, java.lang.Long.class, value)); return true;
        case "filedir":
        case "fileDir": target.getConfiguration().setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "publicforread":
        case "publicForRead": target.getConfiguration().setPublicForRead(property(camelContext, boolean.class, value)); return true;
        case "streamreadsize":
        case "streamReadSize": target.getConfiguration().setStreamReadSize(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "blobmetadata":
        case "blobMetadata": target.getConfiguration().setBlobMetadata(property(camelContext, java.util.Map.class, value)); return true;
        case "blobprefix":
        case "blobPrefix": target.getConfiguration().setBlobPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": target.getConfiguration().setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceOperations.class, value)); return true;
        case "streamwritesize":
        case "streamWriteSize": target.getConfiguration().setStreamWriteSize(property(camelContext, int.class, value)); return true;
        case "useflatlisting":
        case "useFlatListing": target.getConfiguration().setUseFlatListing(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

