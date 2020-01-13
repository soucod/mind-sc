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
package org.xmind.ui.internal.fishbone.structures;

import java.util.List;

import org.xmind.gef.draw2d.geometry.IPrecisionTransformer;
import org.xmind.gef.draw2d.geometry.PrecisionRotator;
import org.xmind.ui.internal.fishbone.Fishbone;
import org.xmind.ui.mindmap.IBranchPart;

public class NorthWestRotated extends AbstractSubFishboneDirection {

    public NorthWestRotated() {
        super(Fishbone.RotateAngle, false, true, true, WEST, EAST);
    }

    public ISubDirection getSubDirection() {
        return NW;
    }

    public void fillFishboneData(IBranchPart branch, FishboneData data,
            IPrecisionTransformer h, PrecisionRotator r, double spacing,
            List<IBranchPart> subbranches) {
        NER.fillFishboneData(branch, data, h, r, spacing, subbranches);
    }

    @Override
    public void fillFishboneExtraData(IBranchPart branch, FishboneData data,
            IPrecisionTransformer h, PrecisionRotator r, double spacing,
            boolean extraBranch) {
        NER.fillFishboneExtraData(branch, data, h, r, spacing, extraBranch);
    }

}