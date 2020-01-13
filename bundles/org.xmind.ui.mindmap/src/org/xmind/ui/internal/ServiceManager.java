/* ******************************************************************************
 * Copyright (c) 2006-2016 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.xmind.ui.internal;

import org.xmind.ui.internal.statushandlers.IErrorReporter;

/**
 * @author Frank Shaka
 *
 */
public class ServiceManager {

    private IErrorReporter errorReporter;

    public void activate() {
        MindMapUIPlugin.getDefault().setServiceManager(this);
    }

    public void deactivate() {
        MindMapUIPlugin.getDefault().setServiceManager(null);
    }

    public void setErrorReporter(IErrorReporter reporter) {
        this.errorReporter = reporter;
    }

    public void unsetErrorReporter(IErrorReporter reporter) {
        if (reporter != this.errorReporter)
            return;
        this.errorReporter = null;
    }

    public IErrorReporter getErrorReporter() {
        return errorReporter;
    }

}
