/*
 * Copyright (C) 2007-${year} Crafter Software Corporation.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.virusscanner.impl;

/**
 * Created by cortiz on 7/15/14.
 */
public class VirusScannerException extends RuntimeException {
    private static final long serialVersionUID = -4890432595979626298L;

    public VirusScannerException(final String message) {
        super(message);
    }

    public VirusScannerException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
