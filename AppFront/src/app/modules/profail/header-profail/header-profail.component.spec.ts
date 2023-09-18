import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderProfailComponent } from './header-profail.component';

describe('HeaderProfailComponent', () => {
  let component: HeaderProfailComponent;
  let fixture: ComponentFixture<HeaderProfailComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HeaderProfailComponent]
    });
    fixture = TestBed.createComponent(HeaderProfailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
