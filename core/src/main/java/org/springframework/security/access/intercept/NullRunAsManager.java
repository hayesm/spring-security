/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.access.intercept;

import java.util.List;

import org.springframework.security.Authentication;
import org.springframework.security.access.ConfigAttribute;


/**
 * Implementation of a {@link RunAsManager} that does nothing.
 * <p>
 * This class should be used if you do not require run-as authentication replacement functionality.
 *
 * @author Ben Alex
 * @version $Id$
 */
final class NullRunAsManager implements RunAsManager {
    //~ Methods ========================================================================================================

    public Authentication buildRunAs(Authentication authentication, Object object, List<ConfigAttribute> config) {
        return null;
    }

    public boolean supports(ConfigAttribute attribute) {
        return false;
    }

    public boolean supports(Class<?> clazz) {
        return true;
    }
}