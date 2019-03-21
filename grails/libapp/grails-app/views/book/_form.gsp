<%@ page import="xyz.supercoders.library.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'price', 'error')} ">
	<label for="price">
		<g:message code="book.price.label" default="Price" />
		
	</label>
	<g:field name="price" value="${fieldValue(bean: bookInstance, field: 'price')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'pages', 'error')} required">
	<label for="pages">
		<g:message code="book.pages.label" default="Pages" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="pages" type="number" value="${bookInstance.pages}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'publicationhouse', 'error')} required">
	<label for="publicationhouse">
		<g:message code="book.publicationhouse.label" default="Publicationhouse" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="publicationhouse" name="publicationhouse.id" from="${xyz.supercoders.library.Publicationhouse.list()}" optionKey="id" required="" value="${bookInstance?.publicationhouse?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="book.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${bookInstance?.title}"/>

</div>

