/*******************************************************************************
 * Copyright (c) 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.visibility.tests.vistest.war2;

import javax.enterprise.context.ApplicationScoped;

import com.ibm.ws.cdi.visibility.tests.vistest.framework.TargetBean;
import com.ibm.ws.cdi.visibility.tests.vistest.qualifiers.InWar2;

@ApplicationScoped
@InWar2
public class War2TargetBean implements TargetBean {

}