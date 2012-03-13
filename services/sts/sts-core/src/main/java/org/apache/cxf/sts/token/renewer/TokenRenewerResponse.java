/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.sts.token.renewer;

import org.w3c.dom.Element;
import org.apache.cxf.sts.token.provider.TokenReference;


/**
 * This class encapsulates the response from a TokenRenewer instance after renewing a token.
 */
public class TokenRenewerResponse {

    private boolean tokenRenewed;
    private Element renewedToken;
    private String tokenId;
    private long lifetime;
    private TokenReference attachedReference;
    private TokenReference unAttachedReference;
    
    public void setTokenRenewed(boolean tokenRenewed) {
        this.tokenRenewed = tokenRenewed;
    }
    
    public boolean isTokenRenewed() {
        return tokenRenewed;
    }
    
    public void setRenewedToken(Element renewedToken) {
        this.renewedToken = renewedToken;
    }
    
    public Element getRenewedToken() {
        return renewedToken;
    }
    
    /**
     * Set the lifetime of the Token to be returned in seconds
     * @param lifetime the lifetime of the Token to be returned in seconds
     */
    public void setLifetime(long lifetime) {
        this.lifetime = lifetime;
    }
    
    /**
     * Get the lifetime of the Token to be returned in seconds
     * @return the lifetime of the Token to be returned in seconds
     */
    public long getLifetime() {
        return lifetime;
    }
    
    /**
     * Set the attached TokenReference
     * @param attachtedReference the attached TokenReference
     */
    public void setAttachedReference(TokenReference attachedReference) {
        this.attachedReference = attachedReference;
    }
    
    /**
     * Get the attached TokenReference
     * @return the attached TokenReference
     */
    public TokenReference getAttachedReference() {
        return attachedReference;
    }
    
    /**
     * Set the unattached TokenReference
     * @param unAttachedReference  Set the unattached TokenReference
     */
    public void setUnattachedReference(TokenReference unattachedReference) {
        this.unAttachedReference = unattachedReference;
    }
    
    /**
     * Get the unattached TokenReference
     * @return the unattached TokenReference
     */
    public TokenReference getUnAttachedReference() {
        return unAttachedReference;
    }
    
    /**
     * Set the token Id
     * @param tokenId the token Id
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    
    /**
     * Get the token Id
     * @return the token Id
     */
    public String getTokenId() {
        return tokenId;
    }
    
}
