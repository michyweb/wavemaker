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

package com.wavemaker.runtime.data.sample.orahr;

// Generated Aug 19, 2007 9:06:50 PM by Hibernate Tools 3.2.0.b9

import java.util.HashSet;
import java.util.Set;

/**
 * Departments generated by hbm2java
 */
@SuppressWarnings({ "serial", "unchecked" })
public class Departments implements java.io.Serializable {

    private short departmentId;

    private Locations locations;

    private Employees employees;

    private String departmentName;

    private Set employeeses = new HashSet(0);

    private Set jobHistories = new HashSet(0);

    public Departments() {
    }

    public Departments(short departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Departments(short departmentId, Locations locations, Employees employees, String departmentName, Set employeeses, Set jobHistories) {
        this.departmentId = departmentId;
        this.locations = locations;
        this.employees = employees;
        this.departmentName = departmentName;
        this.employeeses = employeeses;
        this.jobHistories = jobHistories;
    }

    public short getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(short departmentId) {
        this.departmentId = departmentId;
    }

    public Locations getLocations() {
        return this.locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public Employees getEmployees() {
        return this.employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set getEmployeeses() {
        return this.employeeses;
    }

    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }

    public Set getJobHistories() {
        return this.jobHistories;
    }

    public void setJobHistories(Set jobHistories) {
        this.jobHistories = jobHistories;
    }

}