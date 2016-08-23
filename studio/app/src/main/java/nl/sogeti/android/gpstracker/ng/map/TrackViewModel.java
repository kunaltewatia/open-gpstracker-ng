/*------------------------------------------------------------------------------
 **     Ident: Sogeti Smart Mobile Solutions
 **    Author: rene
 ** Copyright: (c) 2016 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced
 ** Distributed Software Engineering |  or transmitted in any form or by any
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the
 ** 4131 NJ Vianen                   |  purpose, without the express written
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 *
 *   This file is part of OpenGPSTracker.
 *
 *   OpenGPSTracker is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   OpenGPSTracker is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with OpenGPSTracker.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package nl.sogeti.android.gpstracker.ng.map;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableParcelable;
import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public class TrackViewModel {
    public final ObservableParcelable<Uri> uri = new ObservableParcelable<>();
    public final ObservableField<String> name = new ObservableField<>("");
    public final ObservableBoolean isRecording = new ObservableBoolean(false);
    public final ObservableField<LatLng[][]> waypoints = new ObservableField<>();
    public final ObservableField<LatLngBounds> startStopBounds = new ObservableField<>();
    public final ObservableField<LatLngBounds> completeBounds = new ObservableField<>();
    public final ObservableField<LatLngBounds> trackHeadBounds = new ObservableField<>();

    public TrackViewModel(Uri uri) {
        this.uri.set(uri);
    }
}
