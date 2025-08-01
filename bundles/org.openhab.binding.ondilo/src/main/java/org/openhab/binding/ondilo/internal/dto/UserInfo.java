/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.ondilo.internal.dto;

import com.google.gson.annotations.SerializedName;

/**
 * The {@link UserInfo} DTO for representing Ondilo user infos.
 *
 * @author MikeTheTux - Initial contribution
 */
public class UserInfo {
    /*
     * Example JSON representation:
     * {
     * "lastname": "Doe",
     * "firstname": "John",
     * "email": "john@doe.org"
     * }
     */
    @SerializedName("lastname")
    public String lastName;
    @SerializedName("firstname")
    public String firstName;
    public String email;

    public String getUserInfo() {
        return lastName + " " + firstName + " (" + email + ")";
    }
}
