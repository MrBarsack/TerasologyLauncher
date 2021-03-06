/*
 * Copyright (c) 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.launcher.gui;

import org.terasology.launcher.util.BundleUtils;
import org.terasology.launcher.version.GameJob;

final class JobItem {

    private final GameJob job;

    public JobItem(final GameJob job) {
        this.job = job;
    }

    public GameJob getJob() {
        return job;
    }

    /**
     * Used at SettingsMenu.
     */
    @Override
    public String toString() {
        return BundleUtils.getLabel(job.getSettingsKey());
    }
}
