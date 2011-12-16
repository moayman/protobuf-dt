/*
 * Copyright (c) 2011 Google Inc.
 *
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.google.eclipse.protobuf.scoping;

import java.util.Collection;

import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.eclipse.protobuf.protobuf.*;

/**
 * @author alruiz@google.com (Alex Ruiz)
 */
public interface Scoping {

  Collection<IEObjectDescription> allPossibleTypesFor(MessageField field);

  Collection<IEObjectDescription> allPossibleTypesFor(TypeExtension extension);

  Collection<IEObjectDescription> allPossibleMessagesFor(Rpc rpc);

  Collection<IEObjectDescription> allPossibleSourcesOf(CustomOption option);

  Collection<IEObjectDescription> allPossibleSourcesOf(CustomFieldOption option);

  Collection<IEObjectDescription> allPossibleNormalFieldsOf(CustomOption option);

  Collection<IEObjectDescription> allPossibleNormalFieldsOf(CustomFieldOption option);

  Collection<IEObjectDescription> allPossibleExtensionFieldsOf(CustomOption option);

  Collection<IEObjectDescription> allPossibleExtensionFieldsOf(CustomFieldOption option);

  Collection<IEObjectDescription> allPossibleNamesOfNormalFieldsOf(ComplexValue value);

  Collection<IEObjectDescription> allPossibleNamesOfExtensionFieldsOf(ComplexValue value);
}