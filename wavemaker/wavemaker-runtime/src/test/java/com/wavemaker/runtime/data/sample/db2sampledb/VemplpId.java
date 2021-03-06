/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.db2sampledb;

// Generated Feb 7, 2008 1:47:51 PM by Hibernate Tools 3.2.0.CR1

/**
 * VemplpId generated by hbm2java
 */
@SuppressWarnings({ "serial" })
public class VemplpId implements java.io.Serializable {

    private String employeenumber;

    private String phonenumber;

    public VemplpId() {
    }

    public VemplpId(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public VemplpId(String employeenumber, String phonenumber) {
        this.employeenumber = employeenumber;
        this.phonenumber = phonenumber;
    }

    public String getEmployeenumber() {
        return this.employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof VemplpId)) {
            return false;
        }
        VemplpId castOther = (VemplpId) other;

        return (this.getEmployeenumber() == castOther.getEmployeenumber() || this.getEmployeenumber() != null
            && castOther.getEmployeenumber() != null && this.getEmployeenumber().equals(castOther.getEmployeenumber()))
            && (this.getPhonenumber() == castOther.getPhonenumber() || this.getPhonenumber() != null && castOther.getPhonenumber() != null
                && this.getPhonenumber().equals(castOther.getPhonenumber()));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (getEmployeenumber() == null ? 0 : this.getEmployeenumber().hashCode());
        result = 37 * result + (getPhonenumber() == null ? 0 : this.getPhonenumber().hashCode());
        return result;
    }

}
