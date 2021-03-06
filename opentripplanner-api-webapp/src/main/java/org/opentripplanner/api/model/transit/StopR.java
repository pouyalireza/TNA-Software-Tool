/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (props, at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.api.model.transit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.onebusaway.gtfs.model.Agency;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.opentripplanner.routing.transit_index.RouteVariant;
import org.opentripplanner.routing.transit_index.adapters.AgencyAdapter;
import org.opentripplanner.routing.transit_index.adapters.AgencyAndIdAdapter;
import org.opentripplanner.routing.transit_index.adapters.RouteType;
import org.opentripplanner.routing.transit_index.adapters.StopType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement(name = "StopR")
public class StopR {
	
	@XmlAttribute
    @JsonSerialize
	public String StopName;
		
	@XmlAttribute
    @JsonSerialize
    public String StopId;
	
	@XmlAttribute
    @JsonSerialize
    public String URL;
	
	@XmlAttribute
    @JsonSerialize
    public String Routes;
	
	@XmlAttribute
    @JsonSerialize
    public String PopWithinX;	    	
}
