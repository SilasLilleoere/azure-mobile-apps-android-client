/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Apache 2.0 License
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 
See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */

/**
 * QueryNodeVisitor.java
 */
package com.microsoft.windowsazure.mobileservices.table.query;

/**
 * Interface of a query node visitor used to extend functionality.
 */
interface QueryNodeVisitor<E> {

	/**
	 * Visit a constant node.
	 * 
	 * @param nodeIn
	 *            The node to visit
	 * @return Defined by the implementer.
	 */
	E visit(ConstantNode nodeIn);

	/**
	 * Visit a field node.
	 * 
	 * @param nodeIn
	 *            The node to visit
	 * @return Defined by the implementer.
	 */
	E visit(FieldNode nodeIn);

	/**
	 * Visit a unary operator node.
	 * 
	 * @param nodeIn
	 *            The node to visit
	 * @return Defined by the implementer.
	 */
	E visit(UnaryOperatorNode nodeIn);

	/**
	 * Visit a binary operator node.
	 * 
	 * @param nodeIn
	 *            The node to visit
	 * @return Defined by the implementer.
	 */
	E visit(BinaryOperatorNode nodeIn);

	/**
	 * Visit a function call node.
	 * 
	 * @param nodeIn
	 *            The node to visit
	 * @return Defined by the implementer.
	 */
	E visit(FunctionCallNode nodeIn);
}