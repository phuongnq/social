/*
 * Copyright (C) 2007-2014 Crafter Software Corporation.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.social.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Date;

import freemarker.cache.TemplateLoader;
import org.craftercms.social.exceptions.SocialException;
import org.craftercms.social.services.system.ContextPreferencesService;

/**
 *
 */
public class SocialFreemarkerLoader implements TemplateLoader {

    private ContextPreferencesService contextPreferencesService;

    @Override
    public Object findTemplateSource(final String name) throws IOException {
        String[] tmp=name.split("/");
        try {
            return contextPreferencesService.getNotificationEmailTemplate(tmp[0],tmp[1]);
        } catch (SocialException e) {
            throw new IOException("Unable to find Template "+name,e);
        }
    }

    @Override
    public long getLastModified(final Object templateSource) {
        return new Date().getTime();
    }

    @Override
    public Reader getReader(final Object templateSource, final String encoding) throws IOException {
        return new StringReader(templateSource.toString());
    }

    @Override
    public void closeTemplateSource(final Object templateSource) throws IOException {

    }

    public void setContextPreferencesService(final ContextPreferencesService contextPreferencesService) {
        this.contextPreferencesService = contextPreferencesService;
    }
}
