// Generated from G:/Projects/Java/plsqlParser/src/main/java/com/ekazantsev/grammar\PLSQL.g4 by ANTLR 4.9
package com.ekazantsev.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(PLSQLParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(PLSQLParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sql_explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_explain(PLSQLParser.Sql_explainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(PLSQLParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unit_statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement_body(PLSQLParser.Unit_statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role(PLSQLParser.Create_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_option(PLSQLParser.Role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#refresh_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_materialized_view(PLSQLParser.Refresh_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view(PLSQLParser.Create_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_mv_refresh(PLSQLParser.Create_mv_refreshContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#build_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_clause(PLSQLParser.Build_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_permission(PLSQLParser.Alter_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#permission_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission_options(PLSQLParser.Permission_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(PLSQLParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#view_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_options(PLSQLParser.View_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_alias_constraint(PLSQLParser.View_alias_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(PLSQLParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_clause(PLSQLParser.Cluster_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cluster_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_name(PLSQLParser.Cluster_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_attributes(PLSQLParser.Index_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace(PLSQLParser.TablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#key_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_compression(PLSQLParser.Key_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sort_or_nosort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_or_nosort(PLSQLParser.Sort_or_nosortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#visible_or_invisible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisible_or_invisible(PLSQLParser.Visible_or_invisibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parallel_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_clause(PLSQLParser.Parallel_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index_clause(PLSQLParser.Table_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expr(PLSQLParser.Index_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_properties(PLSQLParser.Index_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_partitioned_index(PLSQLParser.Global_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_partitioning_clause(PLSQLParser.Index_partitioning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(PLSQLParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PLSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function(PLSQLParser.String_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PLSQLParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_partitions(PLSQLParser.Individual_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioning_storage_clause(PLSQLParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_compression(PLSQLParser.Table_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_partitioning_storage(PLSQLParser.Lob_partitioning_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_item(PLSQLParser.Lob_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_segname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_segname(PLSQLParser.Lob_segnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#varray_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_item(PLSQLParser.Varray_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions_by_quantity(PLSQLParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partition_quantity(PLSQLParser.Hash_partition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_partitioned_index(PLSQLParser.Local_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_range_partitioned_table(PLSQLParser.On_range_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_list_partitioned_table(PLSQLParser.On_list_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_hash_partitioned_table(PLSQLParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_comp_partitioned_table(PLSQLParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subpartition_clause(PLSQLParser.Index_subpartition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subpartition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_name(PLSQLParser.Subpartition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_index_clause(PLSQLParser.Domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#indextype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndextype(PLSQLParser.IndextypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#odci_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdci_parameters(PLSQLParser.Odci_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_domain_index_clause(PLSQLParser.Local_domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlindex_clause(PLSQLParser.Xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#local_xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_xmlindex_clause(PLSQLParser.Local_xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitmap_join_index_clause(PLSQLParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(PLSQLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relational_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_table(PLSQLParser.Relational_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relational_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_properties(PLSQLParser.Relational_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(PLSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_ref_constraint(PLSQLParser.Inline_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_definition(PLSQLParser.Virtual_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_constraint(PLSQLParser.Out_of_line_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(PLSQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#on_delete_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_clause(PLSQLParser.On_delete_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_ref_constraint(PLSQLParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_logging_props(PLSQLParser.Supplemental_logging_propsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_log_grp_clause(PLSQLParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#log_grp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_grp(PLSQLParser.Log_grpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_id_key_clause(PLSQLParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#physical_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_properties(PLSQLParser.Physical_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_segment_creation(PLSQLParser.Deferred_segment_creationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_attributes_clause(PLSQLParser.Segment_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_attributes_clause(PLSQLParser.Physical_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_clause(PLSQLParser.Storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#size_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_clause(PLSQLParser.Size_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogging_clause(PLSQLParser.Logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_properties(PLSQLParser.Column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_col_properties(PLSQLParser.Object_type_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutable_column_clause(PLSQLParser.Substitutable_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_col_properties(PLSQLParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#nested_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_item(PLSQLParser.Nested_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_properties(PLSQLParser.Object_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#inline_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_constraint(PLSQLParser.Inline_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#references_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences_clause(PLSQLParser.References_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#paren_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_column_list(PLSQLParser.Paren_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(PLSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#check_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_constraint(PLSQLParser.Check_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constraint_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_state(PLSQLParser.Constraint_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#using_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_index_clause(PLSQLParser.Using_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#varray_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_col_properties(PLSQLParser.Varray_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_storage_clause(PLSQLParser.Varray_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_parameters(PLSQLParser.Lob_storage_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_parameters(PLSQLParser.Lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_retention_clause(PLSQLParser.Lob_retention_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_deduplicate_clause(PLSQLParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_compression_clause(PLSQLParser.Lob_compression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#encryption_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_spec(PLSQLParser.Encryption_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_clause(PLSQLParser.Lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmltype_column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_column_properties(PLSQLParser.Xmltype_column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmltype_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_storage(PLSQLParser.Xmltype_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlschema_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlschema_spec(PLSQLParser.Xmlschema_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#allow_or_disallow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_or_disallow(PLSQLParser.Allow_or_disallowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partitioning_clauses(PLSQLParser.Table_partitioning_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partitions(PLSQLParser.Range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#range_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_values_clause(PLSQLParser.Range_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_partition_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partition_description(PLSQLParser.Table_partition_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partitions(PLSQLParser.List_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#list_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_values_clause(PLSQLParser.List_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions(PLSQLParser.Hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_range_partitions(PLSQLParser.Composite_range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_range(PLSQLParser.Subpartition_by_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_list(PLSQLParser.Subpartition_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subpartition_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_template(PLSQLParser.Subpartition_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartition_desc(PLSQLParser.Range_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartition_desc(PLSQLParser.List_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_subparts(PLSQLParser.Individual_hash_subpartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hash_subpartition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartition_quantity(PLSQLParser.Hash_subpartition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_hash(PLSQLParser.Subpartition_by_hashContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#range_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_desc(PLSQLParser.Range_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subparts_by_quantity(PLSQLParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_list_partitions(PLSQLParser.Composite_list_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#list_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_desc(PLSQLParser.List_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_hash_partitions(PLSQLParser.Composite_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#reference_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partitioning(PLSQLParser.Reference_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partition_desc(PLSQLParser.Reference_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#system_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_partitioning(PLSQLParser.System_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_disable_clause(PLSQLParser.Enable_disable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exceptions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptions_clause(PLSQLParser.Exceptions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#row_movement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_movement_clause(PLSQLParser.Row_movement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_archive_clause(PLSQLParser.Flashback_archive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table(PLSQLParser.Object_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_table_substitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table_substitution(PLSQLParser.Object_table_substitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#oid_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_clause(PLSQLParser.Oid_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#oid_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_index_clause(PLSQLParser.Oid_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmltype_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_table(PLSQLParser.Xmltype_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_virtual_columns(PLSQLParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(PLSQLParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(PLSQLParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_table_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties(PLSQLParser.Alter_table_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_table_properties_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties_1(PLSQLParser.Alter_table_properties_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_table_logging(PLSQLParser.Supplemental_table_loggingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_extent_clause(PLSQLParser.Allocate_extent_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_unused_clause(PLSQLParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpgrade_table_clause(PLSQLParser.Upgrade_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecords_per_block_clause(PLSQLParser.Records_per_block_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_iot_clauses(PLSQLParser.Alter_iot_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_table_clause(PLSQLParser.Index_org_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_table_clause(PLSQLParser.Mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_overflow_clause(PLSQLParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_overflow_clause(PLSQLParser.Alter_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_overflow_clause(PLSQLParser.Add_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#shrink_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShrink_clause(PLSQLParser.Shrink_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_mapping_table_clause(PLSQLParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constraint_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_clauses(PLSQLParser.Constraint_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#old_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_constraint_name(PLSQLParser.Old_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#new_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_constraint_name(PLSQLParser.New_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint_clause(PLSQLParser.Drop_constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_primary_key_or_unique_or_generic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_primary_key_or_unique_or_generic_clause(PLSQLParser.Drop_primary_key_or_unique_or_generic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_clauses(PLSQLParser.Column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#add_modify_drop_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_modify_drop_column_clauses(PLSQLParser.Add_modify_drop_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#add_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_column_clause(PLSQLParser.Add_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_column_clauses(PLSQLParser.Modify_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_clause(PLSQLParser.Alter_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_properties(PLSQLParser.Modify_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_substitutable(PLSQLParser.Modify_col_substitutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_clause(PLSQLParser.Drop_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rename_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_column_clause(PLSQLParser.Rename_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#old_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_column_name(PLSQLParser.Old_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#new_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_column_name(PLSQLParser.New_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_collection_retrieval(PLSQLParser.Modify_collection_retrievalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_item(PLSQLParser.Collection_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_storage_clause(PLSQLParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_parameters(PLSQLParser.Modify_lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(PLSQLParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(PLSQLParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_body(PLSQLParser.Create_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_enable_clause(PLSQLParser.Parallel_enable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(PLSQLParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(PLSQLParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relies_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelies_on_part(PLSQLParser.Relies_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#streaming_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_clause(PLSQLParser.Streaming_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(PLSQLParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package(PLSQLParser.Alter_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package(PLSQLParser.Create_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(PLSQLParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(PLSQLParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#package_obj_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_spec(PLSQLParser.Package_obj_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_spec(PLSQLParser.Procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(PLSQLParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#package_obj_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_body(PLSQLParser.Package_obj_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(PLSQLParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(PLSQLParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_body(PLSQLParser.Create_procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(PLSQLParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger(PLSQLParser.Alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger(PLSQLParser.Create_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_follows_clause(PLSQLParser.Trigger_follows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_when_clause(PLSQLParser.Trigger_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_dml_trigger(PLSQLParser.Simple_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_each_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_row(PLSQLParser.For_each_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_dml_trigger(PLSQLParser.Compound_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_trigger(PLSQLParser.Non_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#trigger_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_body(PLSQLParser.Trigger_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#routine_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_clause(PLSQLParser.Routine_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_trigger_block(PLSQLParser.Compound_trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#timing_point_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_point_section(PLSQLParser.Timing_point_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#non_dml_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_event(PLSQLParser.Non_dml_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dml_event_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_clause(PLSQLParser.Dml_event_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dml_event_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_element(PLSQLParser.Dml_event_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_nested_clause(PLSQLParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#referencing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_clause(PLSQLParser.Referencing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#referencing_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_element(PLSQLParser.Referencing_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(PLSQLParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type(PLSQLParser.Alter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#compile_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile_type_clause(PLSQLParser.Compile_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#replace_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_type_clause(PLSQLParser.Replace_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_spec(PLSQLParser.Alter_method_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_method_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_element(PLSQLParser.Alter_method_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_attribute_definition(PLSQLParser.Alter_attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition(PLSQLParser.Attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collection_clauses(PLSQLParser.Alter_collection_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_handling_clause(PLSQLParser.Dependent_handling_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_exceptions_part(PLSQLParser.Dependent_exceptions_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(PLSQLParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_def(PLSQLParser.Object_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_as_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_as_part(PLSQLParser.Object_as_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_under_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_under_part(PLSQLParser.Object_under_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_type_def(PLSQLParser.Nested_table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type(PLSQLParser.Sqlj_object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(PLSQLParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_body_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body_elements(PLSQLParser.Type_body_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_func_declaration(PLSQLParser.Map_order_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_in_type(PLSQLParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl_in_type(PLSQLParser.Proc_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_in_type(PLSQLParser.Func_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(PLSQLParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#modifier_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_clause(PLSQLParser.Modifier_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#object_member_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_member_spec(PLSQLParser.Object_member_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type_attr(PLSQLParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(PLSQLParser.Element_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#element_spec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec_options(PLSQLParser.Element_spec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_spec(PLSQLParser.Subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_procedure_spec(PLSQLParser.Type_procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_spec(PLSQLParser.Type_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constructor_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_spec(PLSQLParser.Constructor_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_function_spec(PLSQLParser.Map_order_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pragma_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_clause(PLSQLParser.Pragma_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pragma_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_elements(PLSQLParser.Pragma_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_elements_parameter(PLSQLParser.Type_elements_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(PLSQLParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(PLSQLParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(PLSQLParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sequence_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_spec(PLSQLParser.Sequence_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_start_clause(PLSQLParser.Sequence_start_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_parameters_clause(PLSQLParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_spec(PLSQLParser.Call_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#java_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_spec(PLSQLParser.Java_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#c_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_spec(PLSQLParser.C_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_agent_in_clause(PLSQLParser.C_agent_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parameters_clause(PLSQLParser.C_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#default_value_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_part(PLSQLParser.Default_value_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(PLSQLParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(PLSQLParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(PLSQLParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_spec(PLSQLParser.Parameter_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pragma_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_declaration(PLSQLParser.Pragma_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_declaration(PLSQLParser.Record_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_dec(PLSQLParser.Record_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(PLSQLParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_var_dec(PLSQLParser.Record_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_declaration(PLSQLParser.Table_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_dec(PLSQLParser.Table_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indexed_by_part(PLSQLParser.Table_indexed_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#varray_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_type_def(PLSQLParser.Varray_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_dec(PLSQLParser.Table_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(PLSQLParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(PLSQLParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PLSQLParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(PLSQLParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(PLSQLParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(PLSQLParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(PLSQLParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_statement(PLSQLParser.Forall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds_clause(PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#between_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_bound(PLSQLParser.Between_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(PLSQLParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(PLSQLParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PLSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PLSQLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_block(PLSQLParser.Trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PLSQLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(PLSQLParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_language_statements(PLSQLParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_manipulation_statements(PLSQLParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(PLSQLParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_control_statements(PLSQLParser.Transaction_control_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#set_transaction_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_command(PLSQLParser.Set_transaction_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#set_constraint_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraint_command(PLSQLParser.Set_constraint_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#write_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_clause(PLSQLParser.Write_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(PLSQLParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(PLSQLParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#factoring_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoring_element(PLSQLParser.Factoring_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(PLSQLParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(PLSQLParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubqueryParen}
	 * labeled alternative in {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryParen(PLSQLParser.SubqueryParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreSubquery}
	 * labeled alternative in {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreSubquery(PLSQLParser.IgnoreSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubqueryCompound}
	 * labeled alternative in {@link PLSQLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryCompound(PLSQLParser.SubqueryCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_operation_part(PLSQLParser.Subquery_operation_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(PLSQLParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Star1}
	 * labeled alternative in {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar1(PLSQLParser.Star1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTable}
	 * labeled alternative in {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTable(PLSQLParser.StarTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreTableview_name}
	 * labeled alternative in {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreTableview_name(PLSQLParser.IgnoreTableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alias_expr}
	 * labeled alternative in {@link PLSQLParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_expr(PLSQLParser.Alias_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PLSQLParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_ref_pivot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_pivot(PLSQLParser.Table_ref_pivotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExpr}
	 * labeled alternative in {@link PLSQLParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpr(PLSQLParser.JoinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableRefSimple}
	 * labeled alternative in {@link PLSQLParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRefSimple(PLSQLParser.TableRefSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableRefAux}
	 * labeled alternative in {@link PLSQLParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRefAux(PLSQLParser.TableRefAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_ref_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux(PLSQLParser.Table_ref_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(PLSQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#join_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_part(PLSQLParser.Join_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#join_using_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_using_part(PLSQLParser.Join_using_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PLSQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(PLSQLParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(PLSQLParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(PLSQLParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_element(PLSQLParser.Pivot_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(PLSQLParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(PLSQLParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_element(PLSQLParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_elements(PLSQLParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(PLSQLParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(PLSQLParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_elements(PLSQLParser.Unpivot_in_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(PLSQLParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#start_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_part(PLSQLParser.Start_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PLSQLParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#group_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_elements(PLSQLParser.Group_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(PLSQLParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(PLSQLParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_elements(PLSQLParser.Grouping_sets_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PLSQLParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(PLSQLParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(PLSQLParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(PLSQLParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(PLSQLParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(PLSQLParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(PLSQLParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_partition_part(PLSQLParser.Model_column_partition_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_list(PLSQLParser.Model_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(PLSQLParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(PLSQLParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_rules_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_part(PLSQLParser.Model_rules_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_rules_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_element(PLSQLParser.Model_rules_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(PLSQLParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_iterate_clause(PLSQLParser.Model_iterate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#until_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_part(PLSQLParser.Until_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PLSQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#order_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_elements(PLSQLParser.Order_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(PLSQLParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_update_of_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_of_part(PLSQLParser.For_update_of_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(PLSQLParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(PLSQLParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(PLSQLParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_based_update_set_clause(PLSQLParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(PLSQLParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(PLSQLParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#multi_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_element(PLSQLParser.Multi_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(PLSQLParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_when_part(PLSQLParser.Conditional_insert_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_else_part(PLSQLParser.Conditional_insert_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(PLSQLParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(PLSQLParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(PLSQLParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(PLSQLParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_element(PLSQLParser.Merge_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete_part(PLSQLParser.Merge_update_delete_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(PLSQLParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#selected_tableview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_tableview(PLSQLParser.Selected_tableviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lock_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_statement(PLSQLParser.Lock_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_nowait_part(PLSQLParser.Wait_nowait_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lock_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_element(PLSQLParser.Lock_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(PLSQLParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#general_table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_table_ref(PLSQLParser.General_table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#static_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_returning_clause(PLSQLParser.Static_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(PLSQLParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_into_part(PLSQLParser.Error_logging_into_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_reject_part(PLSQLParser.Error_logging_reject_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(PLSQLParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_expression(PLSQLParser.Table_collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restriction_clause(PLSQLParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(PLSQLParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#seed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_part(PLSQLParser.Seed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(PLSQLParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(PLSQLParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PLSQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreExpr(PLSQLParser.IgnoreExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PLSQLParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikeExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpr(PLSQLParser.LikeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(PLSQLParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(PLSQLParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExpr(PLSQLParser.BetweenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CursorExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorExpr(PLSQLParser.CursorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpr(PLSQLParser.IsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PLSQLParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(PLSQLParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PLSQLParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PLSQLParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#is_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_part(PLSQLParser.Is_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_part(PLSQLParser.Cursor_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#multiset_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_type(PLSQLParser.Multiset_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(PLSQLParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#like_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_type(PLSQLParser.Like_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#like_escape_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_escape_part(PLSQLParser.Like_escape_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#between_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_elements(PLSQLParser.Between_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(PLSQLParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link PLSQLParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(PLSQLParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreBinaryExpr}
	 * labeled alternative in {@link PLSQLParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreBinaryExpr(PLSQLParser.IgnoreBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenBinaryExpr}
	 * labeled alternative in {@link PLSQLParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBinaryExpr(PLSQLParser.ParenBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(PLSQLParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression(PLSQLParser.Model_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#model_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression_element(PLSQLParser.Model_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(PLSQLParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_like_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_like_part(PLSQLParser.For_like_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_increment_decrement_type(PLSQLParser.For_increment_decrement_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(PLSQLParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreUnaryExpr}
	 * labeled alternative in {@link PLSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreUnaryExpr(PLSQLParser.IgnoreUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link PLSQLParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(PLSQLParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(PLSQLParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(PLSQLParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(PLSQLParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(PLSQLParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(PLSQLParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PLSQLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#expression_or_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_vector(PLSQLParser.Expression_or_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expr(PLSQLParser.Vector_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(PLSQLParser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AggregateCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateCall(PLSQLParser.AggregateCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TodoCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoCall(PLSQLParser.TodoCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlCall(PLSQLParser.XmlCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastCall(PLSQLParser.CastCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtractCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractCall(PLSQLParser.ExtractCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithinOrOverCall}
	 * labeled alternative in {@link PLSQLParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinOrOverCall(PLSQLParser.WithinOrOverCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(PLSQLParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_keyword(PLSQLParser.Over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_clause_keyword(PLSQLParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_prediction_function_keyword(PLSQLParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(PLSQLParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(PLSQLParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_type(PLSQLParser.Windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#windowing_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_elements(PLSQLParser.Windowing_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PLSQLParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#using_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_element(PLSQLParser.Using_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_order_by_part(PLSQLParser.Collect_order_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#within_or_over_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_part(PLSQLParser.Within_or_over_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_matrix_clause(PLSQLParser.Cost_matrix_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_clause(PLSQLParser.Xml_passing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes_clause(PLSQLParser.Xml_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespaces_clause(PLSQLParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(PLSQLParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_general_default_part(PLSQLParser.Xml_general_default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_multiuse_expression_element(PLSQLParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_version_part(PLSQLParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_standalone_part(PLSQLParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_enconding_part(PLSQLParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_version_part(PLSQLParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_ident_part(PLSQLParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sql_plus_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_plus_command(PLSQLParser.Sql_plus_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#whenever_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_command(PLSQLParser.Whenever_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#set_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_command(PLSQLParser.Set_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exit_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_command(PLSQLParser.Exit_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#prompt_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrompt_command(PLSQLParser.Prompt_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#show_errors_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_errors_command(PLSQLParser.Show_errors_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(PLSQLParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(PLSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(PLSQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_quoted_string(PLSQLParser.Alias_quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PLSQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#current_of_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_of_clause(PLSQLParser.Current_of_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#xml_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_column_name(PLSQLParser.Xml_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cost_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_class_name(PLSQLParser.Cost_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(PLSQLParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(PLSQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment_name(PLSQLParser.Rollback_segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_name(PLSQLParser.Table_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(PLSQLParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(PLSQLParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(PLSQLParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#implementation_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_type_name(PLSQLParser.Implementation_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(PLSQLParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(PLSQLParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(PLSQLParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(PLSQLParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(PLSQLParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(PLSQLParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(PLSQLParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PLSQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(PLSQLParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(PLSQLParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PLSQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(PLSQLParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(PLSQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(PLSQLParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(PLSQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PLSQLParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#record_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_name(PLSQLParser.Record_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(PLSQLParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(PLSQLParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PLSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(PLSQLParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableview_name(PLSQLParser.Tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#dot_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_id(PLSQLParser.Dot_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(PLSQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(PLSQLParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(PLSQLParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_analytic(PLSQLParser.Function_argument_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_modeling(PLSQLParser.Function_argument_modelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespect_or_ignore_nulls(PLSQLParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PLSQLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(PLSQLParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#precision_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_part(PLSQLParser.Precision_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#native_datatype_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_datatype_element(PLSQLParser.Native_datatype_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(PLSQLParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PLSQLParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PLSQLParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PLSQLParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PLSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(PLSQLParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PLSQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PLSQLParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#numeric_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_negative(PLSQLParser.Numeric_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(PLSQLParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#r_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_id(PLSQLParser.R_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(PLSQLParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#not_equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_op(PLSQLParser.Not_equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_or_equals_op(PLSQLParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_or_equals_op(PLSQLParser.Less_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#concatenation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_op(PLSQLParser.Concatenation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(PLSQLParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(PLSQLParser.Regular_idContext ctx);
}