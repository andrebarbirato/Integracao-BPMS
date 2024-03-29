/**
 * CrunchifyHelloWorldServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.unimedfortaleza.bpmsintegration.soap;

public class CrunchifyHelloWorldServiceLocator extends org.apache.axis.client.Service implements br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorldService {

    public CrunchifyHelloWorldServiceLocator() {
    }


    public CrunchifyHelloWorldServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrunchifyHelloWorldServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CrunchifyHelloWorld
    private java.lang.String CrunchifyHelloWorld_address = "http://localhost:8090/BpmsIntegration/services/CrunchifyHelloWorld";

    public java.lang.String getCrunchifyHelloWorldAddress() {
        return CrunchifyHelloWorld_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrunchifyHelloWorldWSDDServiceName = "CrunchifyHelloWorld";

    public java.lang.String getCrunchifyHelloWorldWSDDServiceName() {
        return CrunchifyHelloWorldWSDDServiceName;
    }

    public void setCrunchifyHelloWorldWSDDServiceName(java.lang.String name) {
        CrunchifyHelloWorldWSDDServiceName = name;
    }

    public br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorld getCrunchifyHelloWorld() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CrunchifyHelloWorld_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrunchifyHelloWorld(endpoint);
    }

    public br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorld getCrunchifyHelloWorld(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorldSoapBindingStub _stub = new br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorldSoapBindingStub(portAddress, this);
            _stub.setPortName(getCrunchifyHelloWorldWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrunchifyHelloWorldEndpointAddress(java.lang.String address) {
        CrunchifyHelloWorld_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorld.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorldSoapBindingStub _stub = new br.com.unimedfortaleza.bpmsintegration.soap.CrunchifyHelloWorldSoapBindingStub(new java.net.URL(CrunchifyHelloWorld_address), this);
                _stub.setPortName(getCrunchifyHelloWorldWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CrunchifyHelloWorld".equals(inputPortName)) {
            return getCrunchifyHelloWorld();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.bpmsintegration.unimedfortaleza.com.br", "CrunchifyHelloWorldService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.bpmsintegration.unimedfortaleza.com.br", "CrunchifyHelloWorld"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CrunchifyHelloWorld".equals(portName)) {
            setCrunchifyHelloWorldEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
