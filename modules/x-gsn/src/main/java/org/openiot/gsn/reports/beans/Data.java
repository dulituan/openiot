/**
*    Copyright (c) 2011-2014, OpenIoT
*   
*    This file is part of OpenIoT.
*
*    OpenIoT is free software: you can redistribute it and/or modify
*    it under the terms of the GNU Lesser General Public License as published by
*    the Free Software Foundation, version 3 of the License.
*
*    OpenIoT is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU Lesser General Public License for more details.
*
*    You should have received a copy of the GNU Lesser General Public License
*    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
*
*     Contact: OpenIoT mailto: info@openiot.eu
 * @author Timotee Maret
*/

package org.openiot.gsn.reports.beans;

public class Data {
	
	private Object p1;
	
	private Object p2;
	
	private Number value;
	
	private String label;

	public Data (Object p1, Object p2, Number value, String label) {
		this.p1 = p1;
		this.p2 = p2;
		this.value = value;
		this.label = label;
	}

	public Object getP1() {
		return p1;
	}

	public Object getP2() {
		return p2;
	}

	public Number getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}

}
