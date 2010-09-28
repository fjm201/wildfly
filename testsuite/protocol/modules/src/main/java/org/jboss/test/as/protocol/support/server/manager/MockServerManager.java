/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.as.protocol.support.server.manager;

import java.net.InetAddress;
import java.util.Properties;

import org.jboss.as.server.manager.ServerManager;
import org.jboss.as.server.manager.ServerManagerEnvironment;

/**
 *
 * @author <a href="kabir.khan@jboss.com">Kabir Khan</a>
 * @version $Revision: 1.1 $
 */
public class MockServerManager extends ServerManager {

    MockServerManagerMessageHandler managerMessageHandler = new MockServerManagerMessageHandler();

    private MockServerManager(ServerManagerEnvironment environment) {
        // FIXME MockServerManager constructor
        super(environment);
    }

    public static MockServerManager create() throws Exception {
        return new MockServerManager(new MockServerManagerEnvironment(false));
    }

    static class MockServerManagerEnvironment extends ServerManagerEnvironment {

        public MockServerManagerEnvironment(boolean isRestart) throws Exception{
            super(new Properties(), false, System.in, System.out, System.err, "Test", InetAddress.getLocalHost(), 0, InetAddress.getLocalHost(), 0, null);
        }

    }

}
