package org.everit.verifiabledata.itests.core;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

import org.junit.Test;

/**
 * Test interface for testing {@link VerifyService}.
 */
public interface VerifyTest {

    /**
     * Testing the complex test in the methods.
     */
    @Test
    void testComplex();

    /**
     * Testing the create methods.
     */
    @Test
    void testCreates();

    /**
     * Testing getVerificationEndDate method.
     */
    @Test
    void testGetVerificationEndDate();

    /**
     * Testing invalidateData method.
     */
    @Test
    void testInvalidateData();

    /**
     * Testing the reduceVerificationEndDate method.
     */
    @Test
    void testReduceVerificationEndDate();

    /**
     * Testing the rejected token.
     */
    @Test
    void testRejectedRequest();

    /**
     * Testing verifyData method.
     */
    @Test
    void testVerifyData();
}
