/**
 * Copyright (c) 2011-2013, Intel Mobile Communications GmbH
 *
 *
 * This file is part of the Inheritance plug-in for Jenkins.
 *
 * The Inheritance plug-in is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation in version 3
 * of the License
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.	If not, see <http://www.gnu.org/licenses/>.
 */

import hudson.plugins.project_inheritance.projects.InheritanceProject;

f = namespace(lib.FormTagLib);
l = namespace(lib.LayoutTagLib);


f.section(title: _("Inherited Builders")) {
	f.advanced(title: "Expand inherited Build steps", align: "left") {
		f.block() {
			instances = my.getBuildersList(InheritanceProject.IMode.INHERIT_FORCED)
			f.hetero-list(
					items: instances,
					name: "derived-builders",
					hasHeader: "true",
					descriptors: h.getBuilderDescriptors(my)
			)
		}
	}
}
