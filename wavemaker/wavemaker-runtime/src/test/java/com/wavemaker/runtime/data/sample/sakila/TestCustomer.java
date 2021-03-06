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

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jun 26, 2007 4:52:50 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;

/**
 * Customer generated by hbm2java
 */
@SuppressWarnings({ "serial" })
public class TestCustomer implements java.io.Serializable {

    private Short customerId;

    private TestAddress address;

    private String firstName;

    private String lastName;

    private String email;

    private boolean active;

    private Date createDate;

    private Date lastUpdate;

    private TestStore store;

    public TestCustomer() {
    }

    public TestCustomer(TestAddress address, String firstName, String lastName, boolean active, Date createDate, Date lastUpdate) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    public Short getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public TestStore getStore() {
        return this.store;
    }

    public void setStore(TestStore store) {
        this.store = store;
    }

    public TestAddress getAddress() {
        return this.address;
    }

    public void setAddress(TestAddress address) {
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
