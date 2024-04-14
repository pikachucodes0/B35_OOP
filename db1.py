from tkinter import *
import sqlite3
root = Tk()
lbl=Label(root, text="Employee Management System",font=("Arial Bold",50))
lbl.place(x=200,y=0)
root.geometry("1500x1500")
root.resizable(0,0)
conn=sqlite3.connect("Gender_database.db")
c=conn.cursor()
c.execute("""CREATE TABLE IF NOT EXISTS employee(
                   ID INTEGER PRIMARY KEY AUTOINCREMENT,
                   uname TEXT,
                   adr  TEXT,
                   rl TEXT,
                   slr INT
    )""")
conn.commit()
conn.close()

def add():
    conn=sqlite3.connect("Gender_database.db")
    c=conn.cursor()
    c.execute("INSERT INTO employee(uname,adr,rl,slr) VALUES(?,?,?,?)",
              (username.get(),address.get(),role.get(),salary.get()))
    conn.commit()
    conn.close()
    username.delete(0,END)
    address.delete(0,END)
    role.delete(0,END)
    salary.delete(0,END)

def retrieve():
    conn=sqlite3.connect("Gender_database.db")
    c=conn.cursor()
    #execute a select query to retrieve all records from 'employee'  table
    c.execute("SELECT * FROM employee")
    records = c.fetchall()
    print_records=''
    for record in records:
        print_records += str(record[0])+'   '+str(record[1])+'  '+str(record[2])+'  '+str(record[3])+'  '+str(record[4])+'\n'
    query_label=Label(root,text=print_records)
    query_label.place(x=500,y=100)
    conn.close()

def delete():
    conn=sqlite3.connect("Gender_database.db")
    c=conn.cursor()
    c.execute("DELETE FROM employee WHERE ID="+delete_box.get())
    conn.commit()
    conn.close()
    delete_box.delete(0,END)
    retrieve()
  
def edit():
    global editor
    editor=Tk()
    editor.title("UPDATE DATA")
    editor.geometry('300x400')
    conn=sqlite3.connect("Gender_database.db")
    c=conn.cursor()
    record_id=update_box.get()
    c.execute("SELECT * FROM employee WHERE ID=?",(record_id,))
    records=c.fetchall()

    global username_editor
    global address_editor
    global role_editor
    global salary_editor

    username_editor=Entry(editor,width=30)
    username_editor.grid(row=0,column=1,padx=20,pady=(10,0))
    role_editor=Entry(editor,width=30)
    role_editor.grid(row=1,column=1)
    address_editor=Entry(editor,width=30)
    address_editor.grid(row=2,column=1)
    salary_editor=Entry(editor,width=30)
    salary_editor.grid(row=3,column=1)

    username_label=Label(editor,text="Username")
    username_label.grid(row=0,column=0,pady=(10,0))
    address_label=Label(editor,text="Address")
    address_label.grid(row=1,column=0)
    role_label=Label(editor,text="Role")
    role_label.grid(row=2,column=0)
    salary_label=Label(editor,text="Salary")
    salary_label.grid(row=3 ,column=0)

    
    #loop through the results
    for record in records:
        username_editor.insert(0,record[1])
        address_editor.insert(0,record[2])
        role_editor.insert(0,record[3])
        salary_editor.insert(0,record[4])

    #update box button
    update_box.delete(0,END)
    edit_btn=Button(editor,text="Save",command=lambda:update(record_id))
    edit_btn.grid(row=6,column=0,columnspan=2,pady=10,padx=10,ipadx=125)


def update(record_id):
    conn=sqlite3.connect("Gender_database.db")
    c=conn.cursor()
    c.execute("""
            UPDATE employee SET
            uname= :u,
            adr= :a,
            rl=:r,
            slr=:s
            WHERE ID= :id """,

            {
                'u':username_editor.get(),
                'a':address_editor.get(),
                'r':role_editor.get(),
                's':salary_editor.get(),
                'id':record_id
            }
        )
    conn.commit()
    conn.close()
#destroy all data and closing window
    editor.destroy()
    retrieve()

label_username=Label(root,text="Username",font=("Arial Bold",20))
label_username.place(x=10,y=100)
label_address=Label(root,text="Address",font=("Arial Bold",20))
label_address.place(x=10,y=150)
label_role=Label(root,text="Role",font=("Arial Bold",20))
label_role.place(x=10,y=200)
label_password=Label(root,text="Salary",font=("Arial Bold",20))
label_password.place(x=10,y=250)
label_delete=Label(root,text="Delete_Record",font=("Arial Bold",20))
label_delete.place(x=10,y=370)
label_update=Label(root,text="Update_Record",font=("Arial Bold",20))
label_update.place(x=10,y=420)


username=Entry(root,width=30)
username.place(x=220,y=100,height=30)
address=Entry(root,width=30)
address.place(x=220,y=150,height=30)
role=Entry(root,width=30)
role.place(x=220,y=200,height=30)
salary=Entry(root,width=30)
salary.place(x=220,y=250,height=30)
delete_box=Entry(root,width=30)
delete_box.place(x=220,y=370,height=30)
update_box=Entry(root,width=30)
update_box.place(x=220,y=420,height=30)


btn_add=Button(root,text="Add",font=("Arial Bold",17),command=add)
btn_add.place(x=20,y=300)
btn_retrieve=Button(root,text="Retrieve",font=("Arial Bold",17),command=retrieve)
btn_retrieve.place(x=120,y=300)
btn_delete=Button(root,text="Delete",font=("Arial Bold",17),command=delete)
btn_delete.place(x=420,y=360)
btn_update=Button(root,text="Update",font=("Arial Bold",17),command=edit)
btn_update.place(x=420,y=420)
root.mainloop()