/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
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
package org.xmind.ui.internal;

import org.eclipse.draw2d.IFigure;
import org.xmind.gef.draw2d.DecoratedConnectionFigure;
import org.xmind.gef.part.IGraphicalPart;
import org.xmind.ui.animation.LayoutPlaybackProvider;

public class MindMapPlaybackProvider extends LayoutPlaybackProvider {

    protected Object getChildState(Object child, IFigure figure,
            IGraphicalPart part) {
        if (exclude(child, figure, part))
            return null;
        return super.getChildState(child, figure, part);
    }

    protected boolean exclude(Object child, IFigure figure, IGraphicalPart part) {
        return child instanceof DecoratedConnectionFigure;
    }

}