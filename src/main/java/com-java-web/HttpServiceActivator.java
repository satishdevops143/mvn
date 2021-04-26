/*
 * Copyright © 2011 jbundle.org. All rights reserved.
 */
package com-java-web;

/**
 * Start up the web service listener.
 * @author don
 */
public class HttpServiceActivator extends com-java-web.osgi.HttpServiceActivator
{
    public String getServletClass()
    {
        return org.apache.catalina.servlets.WebdavServlet.class.getName();    // Override this to enable config admin.
    }
}
